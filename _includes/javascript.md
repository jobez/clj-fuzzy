---

## Installation
To use the clj-fuzzy library client-side, just include the JavaScript build of the library available [here](https://raw.github.com/Yomguithereal/clj-fuzzy/master/src-js/clj-fuzzy.js).

```html
<script type="text/javascript" src="/path/to/your/clj-fuzzy.js" />
```

If you need it, the [node version](/node.html) already works with `browserify` and any other tools enabling you to use `require` for client-side assets.

---

## Usage
When the clj-fuzzy library is included client-side, a object called `clj_fuzzy` is exported to the global scope so you can use it afterwards.

The library ships with three API namespaces: `clj_fuzzy.metrics`, `clj_fuzzy.stemmers` and finally `clj_fuzzy.phonetics`, embarking the relevant algorithms.

{% capture md %}{% include toc.md %}{% endcapture %}
{{ md | markdownify }}

---

{% capture md2 %}{% include javascript_examples.md %}{% endcapture %}
{{ md2 | markdownify }}