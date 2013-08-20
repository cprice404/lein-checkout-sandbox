# lein-checkout-sandbox

The purpose of this project was twofold:

* experiment with adding a dependency from a local maven repo rather than a public one
* experiment with the 'checkouts' feature of leinengen.  This feature allows you to create a `checkouts` directory in your project dir, and then, inside of the `checkouts` directory, you can create symlinks to a local source directory for a project that is listed in the `dependencies` section of the `project.clj`.  Lein will prefer the local source over the binary dependency.  (Pretty sweet!)

For more info:

https://github.com/technomancy/leiningen/blob/stable/doc/TUTORIAL.md#checkout-dependencies

Both things worked well and were very simple to set up.
