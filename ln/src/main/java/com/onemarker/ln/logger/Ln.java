package com.onemarker.ln.logger;

/**
 * Created by Niranjan on 12-07-2014.
 */
public final class Ln {
    /**
     * lnImpl is initially set to LnImpl() with sensible defaults, then replaced
     * by whatever binding you choose during guice static injection pass.
     */
    @SuppressWarnings(value="MS_SHOULD_BE_FINAL")

    protected static LnInterface lnImpl = new LnImpl();

    private Ln() {}

    /**
     * Writes a throwable to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than VERBOSE
     *
     * @param  t Throwable to be logged
     * @return The number of bytes written.
     * @see Throwable
     */
    public static int v(Throwable t) {
        return lnImpl.v(t);
    }

    /**
     * Writes an object(after trying to convert it to string) or a formatted string to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than VERBOSE
     *
     * @param  s1 an object or a format string (see {@link java.util.Formatter#format})
     * @param args
     *            the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format},
     *            additional arguments are ignored.
     * @return The number of bytes written.
     * @see Object,String,java.util.Formatter
     */
    public static int v(Object s1, Object... args) {
        return lnImpl.v(s1, args);
    }

    /**
     * Writes a throwable and an object(after trying to convert it to string) or a formatted string to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than VERBOSE
     *
     * @param  s1 an object or a format string (see {@link java.util.Formatter#format})
     * @param args
     *            the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format},
     *            additional arguments are ignored.
     * @return The number of bytes written.
     * @see Object,String,java.util.Formatter
     */
    public static int v(Throwable throwable, Object s1, Object... args ) {
        return lnImpl.v(throwable,s1,args);
    }

    /**
     * Writes a throwable to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than DEBUG
     *
     * @param  t Throwable to be logged
     * @return The number of bytes written.
     * @see Throwable
     */
    public static int d(Throwable t) {
        return lnImpl.d(t);
    }

    /**
     * Writes an object(after trying to convert it to string) or a formatted string to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than DEBUG
     *
     * @param  s1 an object or a format string (see {@link java.util.Formatter#format})
     * @param args
     *            the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format},
     *            additional arguments are ignored.
     * @return The number of bytes written.
     * @see Object,String,java.util.Formatter
     */
    public static int d(Object s1, Object... args) {
        return lnImpl.d(s1,args);
    }

    /**
     * Writes a throwable and an object(after trying to convert it to string) or a formatted string to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than DEBUG
     *
     * @param  t Throwable to be logged
     * @param  s1 an object or a format string (see {@link java.util.Formatter#format})
     * @param args
     *            the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format},
     *            additional arguments are ignored.
     * @return The number of bytes written.
     * @see Object,String,java.util.Formatter
     */
    public static int d(Throwable t, Object s1, Object... args) {
        return lnImpl.d(t, s1, args);
    }

    /**
     * Writes a throwable to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than INFO
     *
     * @param  t Throwable to be logged
     * @return The number of bytes written.
     * @see Throwable
     */
    public static int i(Throwable t) {
        return lnImpl.i(t);
    }

    /**
     * Writes an object(after trying to convert it to string) or a formatted string to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than INFO
     *
     * @param  s1 an object or a format string (see {@link java.util.Formatter#format})
     * @param args
     *            the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format},
     *            additional arguments are ignored.
     * @return The number of bytes written.
     * @see Object,String,java.util.Formatter
     */
    public static int i( Object s1, Object... args) {
        return lnImpl.i(s1, args);
    }

    /**
     * Writes a throwable and an object(after trying to convert it to string) or a formatted string to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than INFO
     *
     * @param  t Throwable to be logged
     * @param  s1 an object or a format string (see {@link java.util.Formatter#format})
     * @param args
     *            the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format},
     *            additional arguments are ignored.
     * @return The number of bytes written.
     * @see Object,String,java.util.Formatter
     */
    public static int i(Throwable t, Object s1, Object... args) {
        return lnImpl.i(t, s1, args);
    }

    /**
     * Writes a throwable to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than WARN
     *
     * @param  t Throwable to be logged
     * @return The number of bytes written.
     * @see Throwable
     */
    public static int w(Throwable t) {
        return lnImpl.w(t);
    }

    /**
     * Writes an object(after trying to convert it to string) or a formatted string to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than WARN
     *
     * @param  s1 an object or a format string (see {@link java.util.Formatter#format})
     * @param args
     *            the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format},
     *            additional arguments are ignored.
     * @return The number of bytes written.
     * @see Object,String,java.util.Formatter
     */
    public static int w( Object s1, Object... args) {
        return lnImpl.w(s1,args);
    }

    /**
     * Writes a throwable and an object(after trying to convert it to string) or a formatted string to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than WARN
     *
     * @param  t Throwable to be logged
     * @param  s1 an object or a format string (see {@link java.util.Formatter#format})
     * @param args
     *            the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format},
     *            additional arguments are ignored.
     * @return The number of bytes written.
     * @see Object,String,java.util.Formatter
     */
    public static int w( Throwable t, Object s1, Object... args) {
        return lnImpl.w(t,s1,args);
    }

    /**
     * Writes a throwable to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than ERROR
     *
     * @param  t Throwable to be logged
     * @return The number of bytes written.
     * @see Throwable
     */
    public static int e(Throwable t) {
        return lnImpl.e(t);
    }

    /**
     * Writes an object(after trying to convert it to string) or a formatted string to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than ERROR
     *
     * @param  s1 an object or a format string (see {@link java.util.Formatter#format})
     * @param args
     *            the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format},
     *            additional arguments are ignored.
     * @return The number of bytes written.
     * @see Object,String,java.util.Formatter
     */
    public static int e( Object s1, Object... args) {
        return lnImpl.e(s1,args);
    }

    /**
     * Writes a throwable and an object(after trying to convert it to string) or a formatted string to the log and returns the number of bytes written.
     * <p>
     * This method returns a 0 if the minimum log level set is higher than ERROR
     *
     * @param  t Throwable to be logged
     * @param  s1 an object or a format string (see {@link java.util.Formatter#format})
     * @param args
     *            the list of arguments passed to the formatter. If there are
     *            more arguments than required by {@code format},
     *            additional arguments are ignored.
     * @return The number of bytes written.
     * @see Object,String,java.util.Formatter
     */
    public static int e( Throwable t, Object s1, Object... args) {
        return lnImpl.e(t,s1,args);
    }

    /**
     * Returns true if Debug Level is enabled
     * <p>
     * Returns true if Debug Level is enabled
     *
     * @return boolean
     * @see android.util.Log
     */
    public static boolean isDebugEnabled() {
        return lnImpl.isDebugEnabled();
    }

    /**
     * Returns true if Verbose Level is enabled
     * <p>
     * Returns true if Verbose Level is enabled
     *
     * @return boolean
     * @see android.util.Log
     */
    public static boolean isVerboseEnabled() {
        return lnImpl.isVerboseEnabled();
    }

    /**
     * Returns the current minimum logging level
     * <p>
     *
     * @return The current minimum Log Level as an integer
     * @see android.util.Log
     */
    public static int getLoggingLevel() {
        return lnImpl.getLoggingLevel();
    }

    /**
     * Set the minimum log level
     * <p>
     *
     * @param level The minimum log level allowed
     * @see android.util.Log
     */
    public static void setLoggingLevel(int level) {
        lnImpl.setLoggingLevel(level);
    }

    /**
     * Convert integer to human readable log level
     * <p>
     *
     * @param loglevel The log level integer
     * @return The log level as a human readable string
     * @see android.util.Log
     */
    public static String logLevelToString( int loglevel ) {
        return lnImpl.logLevelToString(loglevel);
    }
}
