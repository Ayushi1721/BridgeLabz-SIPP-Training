package Day1_LinkedList;
import java.util.*;

class Process {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    Process next;

    public Process(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

class RoundRobinScheduler {
    Process head = null;
    int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    public void addProcess(int pid, int burstTime, int priority) {
        Process newProcess = new Process(pid, burstTime, priority);
        if (head == null) {
            head = newProcess;
            head.next = head; // circular link
            return;
        }
        Process temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newProcess;
        newProcess.next = head;
    }

    public void removeProcess(int pid) {
        if (head == null) return;
        if (head.pid == pid && head.next == head) { head = null; return; }
        Process prev = head, curr = head.next;
        if (head.pid == pid) {
            while (prev.next != head) prev = prev.next;
            prev.next = head.next;
            head = head.next;
            return;
        }
        while (curr != head) {
            if (curr.pid == pid) { prev.next = curr.next; return; }
            prev = curr; curr = curr.next;
        }
    }

    public void schedule() {
        if (head == null) return;
        Process temp = head;
        int totalProcesses = 0;
        double totalWait = 0, totalTurnAround = 0;
        Map<Integer, Integer> waitTimes = new HashMap<>();
        Map<Integer, Integer> turnAroundTimes = new HashMap<>();

        while (true) {
            boolean done = true;
            do {
                if (temp.remainingTime > 0) {
                    done = false;
                    int executedTime = Math.min(timeQuantum, temp.remainingTime);
                    temp.remainingTime -= executedTime;
                    waitTimes.put(temp.pid, waitTimes.getOrDefault(temp.pid, 0));
                    turnAroundTimes.put(temp.pid, turnAroundTimes.getOrDefault(temp.pid, 0) + executedTime);
                    if (temp.remainingTime == 0) {
                        totalTurnAround += turnAroundTimes.get(temp.pid);
                        totalProcesses++;
                        System.out.println("Process " + temp.pid + " finished execution.");
                        removeProcess(temp.pid);
                    }
                }
                temp = temp.next;
            } while (temp != head);
            if (done) break;
        }

        System.out.println("Average Turn-Around Time: " + totalTurnAround / totalProcesses);
    }
}

public class RoundRobinDemo {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4);
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.schedule();
    }
}

