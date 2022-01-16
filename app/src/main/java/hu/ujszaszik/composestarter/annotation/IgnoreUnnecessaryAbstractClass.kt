package hu.ujszaszik.composestarter.annotation

/**
 * Explicitly marking an abstract class to be excluded from Detekt Unnecessary Abstract Class Rule
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class IgnoreUnnecessaryAbstractClass