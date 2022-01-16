package hu.ujszaszik.composestarter.annotation

/**
 * Explicitly marking a class or function to be excluded from Detekt Long Parameter List rule
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.SOURCE)
annotation class AllowLongParameterList