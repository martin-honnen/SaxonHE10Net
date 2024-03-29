/**
 * <p>This package provides classes that interface Saxon to the .NET platform.</p>
 * <p>These classes are used only in the .NET version of Saxon; they are not present
 * in the version for the Java platform.</p>
 * <p>Most of these class encapsulate a .NET class in a wrapper that implements a Java interface:
 * either an interface defined in the JDK specifications, or a Saxon-defined interface.
 * For example, DotNetInputStream wraps a .NET Stream as a Java InputStream, while a DotNetPullProvider
 * wraps an XMLReader as a Saxon PullProvider. This enables the .NET service to be used
 * as a functional substitute for Java code implementing the same interface.</p>
 * <p>The instantiation of these classes is generally controlled through the Platform object
 * registered with the Configuration, which has one instance for the Java platform and another
 * for the .NET platform.</p>
 */
package net.sf.saxon.dotnet;