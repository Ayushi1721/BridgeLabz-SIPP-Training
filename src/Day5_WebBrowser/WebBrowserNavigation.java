package Day5_WebBrowser;

import java.util.Stack;


interface NavigationManager {
    void openTab(String url);
    void goBack();
    void goForward();
    void showCurrentTab();
}

class DesktopBrowser implements NavigationManager {
    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentTab = "home";

    
    public void openTab(String url) {
        if (currentTab != null) {
            backStack.push(currentTab);
        }
        currentTab = url;
        forwardStack.clear(); 
        System.out.println("Opened: " + url);
    }

    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentTab);
            currentTab = backStack.pop();
            System.out.println("Went back to: " + currentTab);
        } else {
            System.out.println("No tabs in back history.");
        }
    }

      public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentTab);
            currentTab = forwardStack.pop();
            System.out.println("Went forward to: " + currentTab);
        } else {
            System.out.println("No tabs in forward history.");
        }
    }

    public void showCurrentTab() {
        System.out.println("Current Tab: " + currentTab);
    }
}

class MobileBrowser extends DesktopBrowser {
    public void openTab(String url) {
        System.out.print("[Mobile] ");
        super.openTab(url);
    }
}

public class WebBrowserNavigation {
    public static void main(String[] args) {
        NavigationManager browser = new DesktopBrowser(); // Polymorphism

        browser.openTab("https://google.com");
        browser.openTab("https://openai.com");
        browser.openTab("https://github.com");

        browser.showCurrentTab(); 
        browser.goBack();         
        browser.goBack();         
        browser.goForward();      
        browser.showCurrentTab();

        System.out.println("\n--- Now using mobile browser ---");
        NavigationManager mobile = new MobileBrowser();
        mobile.openTab("https://whatsapp.com");
        mobile.openTab("https://youtube.com");
        mobile.goBack();
        mobile.showCurrentTab();
    }
}
