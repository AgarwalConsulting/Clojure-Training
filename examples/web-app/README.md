# Web apps

Clojure standard library does not ship with a http server. There are two widely used options in this space:

- [ring-core](https://github.com/ring-clojure/ring) with [Jetty](https://www.eclipse.org/jetty/)
- [Http-kit](http://http-kit.github.io/)

## Libraries over frameworks

> The Clojure community has a diverse set of libraries which focus on a specific need. These libraries are assembled to rapidly develop a tailored solution. Using a library approach means those libraries are relatively simple to replace with alternatives or your own libraries.

### Preference for libraries

> Clojure does not focus on the classic framework approach like Rails or Spring, for a very good reason. Frameworks are design decisions others have made without knowing the context of the current problem at hand, so there is no guarantee on how many of those decisions are relevant. Frameworks tend to include many features not relevant to the current problem. Frameworks can be over relied upon, taking away an opportunity to think about the most relevant solution.

### Commonly used libraries

- [Korma](https://github.com/korma/Korma) or [HugSQL](https://www.hugsql.org/)
- [Compojure](https://github.com/weavejester/compojure) or [Bidi](https://github.com/juxt/bidi)
- [Cheshire](https://github.com/dakrone/cheshire)
