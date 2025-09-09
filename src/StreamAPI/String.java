List<String> formattedNames = customers.stream()
    .map(String::toUpperCase)
    .sorted()
    .collect(Collectors.toList());
