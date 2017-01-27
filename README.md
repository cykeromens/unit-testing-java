unit-test
=========

A "UnitTest” sample written in Java using Maven for the build, that showcases a few very simple tests.


`First, when you mock a class using the mock method of the Mockito class, this is essentially what happens:
`
**Mockito.mock** delegates to [org.mockito.internal.MockitoCore.mock]() , passing the default mock settings as a parameter.
MockitoCore.mock delegates to org.mockito.internal.util.MockUtil.createMock
The MockUtil class uses the ClassPathLoader class to get an instance of MockMaker to use to create the mock. 

By default, the _CgLibMockMaker_ class is used. _CgLibMockMaker_ uses a class borrowed from JMock, ClassImposterizer that handles creating the mock.
The key pieces of the 'mockito magic' used are the _MethodInterceptor_ used to create the mock: 
the mockito MethodInterceptorFilter, and a chain of MockHandler instances, including an instance of _MockHandlerImpl_. 

`The method interceptor passes invocations to MockHandlerImpl instance, which implements the business logic that should be applied when a 
method is invoked on a mock (ie, searching to see if an answer is recorded already, determining if the invocation represents a new stub, etc. `

The default state is that if a stub is not already registered for the method being invoked, a type-appropriate empty value is returned.
Now, let's look at the code in your example:`when(mock.method()).thenReturn(someValue)
Here is the order that this code will execute in:
mock.method()
when(<result of step 1>)
<result of step 2>.thenReturn`

This example demonstrates:

* Unit tests written with [JUnit 4](http://junit.org/)
* Unit test using [PowerMockito](https://code.google.com/p/powermock/) to mock classes and test `System.exit()`
* Integration tests written with [JUnit 4](http://junit.org/)
* Integration test using [system-rules](http://www.stefan-birkner.de/system-rules/) to test `System.out`
* Code coverage reports via [Cobertura](http://cobertura.github.io/cobertura/)
* A Maven build that puts it all together

Running the tests
-----------------

* To run the unit tests, call `mvn test`
* To run the integration tests as well, call `mvn verify`
* To generate (unit test) code coverage reports, call `mvn cobertura:cobertura`, and point a browser at the output in `target/site/cobertura/`

Conventions
-----------

This example follows the following basic conventions:

 | unit test | integration test
--- | --- | ---
__resides in:__ | `src/test/java/*Test.java` | `src/test/java/*IT.java`
__executes in Maven phase:__ | test | verify
__handled by Maven plugin:__ | [surefire](http://maven.apache.org/surefire/maven-surefire-plugin/) | [failsafe](http://maven.apache.org/surefire/maven-failsafe-plugin/)
