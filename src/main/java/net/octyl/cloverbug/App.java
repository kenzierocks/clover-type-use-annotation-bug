package net.octyl.cloverbug;

import javax.validation.constraints.NotNull;
import java.util.List;

public class App {
    private final List<@NotNull String> testValue = List.of();
}
