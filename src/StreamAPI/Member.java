LocalDate now = LocalDate.now();
List<Member> expiringSoon = members.stream()
    .filter(m -> ChronoUnit.DAYS.between(now, m.getExpiryDate()) <= 30)
    .collect(Collectors.toList());
