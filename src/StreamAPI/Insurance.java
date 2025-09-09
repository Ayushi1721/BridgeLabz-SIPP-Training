Map<String, Double> avgClaims = claims.stream()
    .collect(Collectors.groupingBy(
        Claim::getType,
        Collectors.averagingDouble(Claim::getAmount)
    ));
