package hu.ujszaszik.composestarter.annotation

/**
 * Explicitly marking a class to be excluded from Detekt Max Line Length rule
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class AllowLongTexts