package me.sudohippie.throttle.strategy;

import java.util.concurrent.TimeUnit;

/**
 * Represents a throttling strategy.
 *
 * Raghav Sidhanti
 * 9/25/13
 */
public abstract class ThrottleStrategy {

    /**
     * This method will return <i>true</i> if a single request
     * has been throttled (rate-limited) or <i>false</i> if
     * the request is not throttled (not rate-limited).
     *
     * @return
     */
    public abstract boolean isThrottled();

    /**
     * This method will return <i>true</i> if {@code n} requests
     * have been throttled or <i>false</i> if {@code n} requests
     * have not been throttled.
     *
     * @param n
     * @return
     */
    public abstract boolean isThrottled(long n);

	/**
	 * Provides time for n tokens to be available.
	 *
	 * @param n
	 * @param timeUnit
	 * @return
	 */
	public abstract long timeToRelease(long n, TimeUnit timeUnit);

	/**
	 * Defines the maximum tokens this strategy can handle.
	 *
	 * @return
	 */
	public abstract long getCapacity();
}
