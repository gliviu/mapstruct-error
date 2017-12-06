package mapstruct;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.Optional;

/**
 * Indicates a nullable local variable, field, method parameter or return. Otherwise not null is implied.
 * Generally we prefer to use {@link Optional} instead.
 * This marker is reserved for cases where Optional is not an option like in mongodb at this time.
 */
@Target({ElementType.TYPE_USE})
public @interface Nullable {}
