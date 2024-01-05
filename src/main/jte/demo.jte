@import com.example.demo.DemoModel

@param DemoModel model

<link href="https://cdn.jsdelivr.net/npm/daisyui@4.5.0/dist/full.min.css" rel="stylesheet" type="text/css" />
<script src="https://unpkg.com/htmx.org@1.9.10"></script>
<script src="https://unpkg.com/htmx.org/dist/ext/json-enc.js"></script>
<script src="https://cdn.tailwindcss.com"></script>
<header class="navbar bg-base-100">
  <div class="flex-none">
    <button class="btn btn-square btn-ghost">
      <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24"
        class="inline-block w-5 h-5 stroke-current">
        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2" d="M4 6h16M4 12h16M4 18h16"></path>
      </svg>
    </button>
  </div>
  <div class="flex-1">
    <a class="btn btn-ghost text-xl">daisyUI</a>
  </div>
  <div class="flex-none">
    <button class="btn btn-square btn-ghost">
      <svg xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24"
        class="inline-block w-5 h-5 stroke-current">
        <path stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
          d="M5 12h.01M12 12h.01M19 12h.01M6 12a1 1 0 11-2 0 1 1 0 012 0zm7 0a1 1 0 11-2 0 1 1 0 012 0zm7 0a1 1 0 11-2 0 1 1 0 012 0z">
        </path>
      </svg>
    </button>
  </div>
</header>

<body>
  <form hx-post="/form-submit">
    <button class="btn btn-primary">Click me</button>

    <input name="the_checkbox" type="checkbox" class="toggle toggle-success" checked />
    <input type="number" name="amount" placeholder="Amount" class="input input-bordered w-full max-w-xs" />
    <input type="date" name="cash_date" />
  </form>

  <details class="collapse bg-base-200">
    <summary class="collapse-title text-xl font-medium">Click to open/close</summary>
    <div class="collapse-content">
      <p>content</p>
    </div>
  </details>
</body>