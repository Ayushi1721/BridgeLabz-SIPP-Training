List<Movie> top5 = movies.stream()
.filter(m -> m.getRating() >= 7.5)  // filter by rating threshold
.sorted(Comparator.comparing(Movie::getRating).reversed()
        .thenComparing(Movie::getReleaseYear).reversed())
.limit(5)
.collect(Collectors.toList());
