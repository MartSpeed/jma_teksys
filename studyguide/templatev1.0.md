# Server Set up Template v1.0

Will you go to the dumb creek already,
Im trying study for a test I Have to take in 2 years.

- ​Bernard

1. Run `npm init` from the terminal
2. Run `npm install express` from the terminal
3. Run `npm install pg` from the terminal
4. Create `.gitignore` file
   - `node_modules/` needs to be present
   - `.DS_Store` needs to be present
5. Update `package.json` file with `start` command
   - Find the `"scripts"` section
   - Add the following: `"start": "node ./server/server.js"`
6. Create `server` directory
7. Create `server.js` inside of the `server` directory
   - `const express = require('express')`
   - `const app = express()`
   - `const port = 5000`
   - `app.use(express.static('server/public'))`
   - `app.use(express.json())`
   - `app.use (express.urlencoded({extended: true}))`
   - `app.listen(port, function() { console.log("I'm listening....", port); })`
8. Create `public` directory inside of the `server` directory
9. Create `index.html` inside of the `public` directory
10. Create `styles` directory inside of the `public` directory
11. Create `style.css` inside of the `styles` directory
    ​

- `<link>` file to `index.html`
  ​

12. Create `scripts` directory inside of the `public` directory
13. Create `client.js` inside of the `scripts` directory
    ​

- `<script src>` file to `index.html`
  ​

14. Create `vendors` directory inside of the `public` director
    ​

- Create `jQuery.js` inside of the `vendors` directory
  ​
- `<script src>` file to `index.html` before `client.js`
  ​

15. Create `modules` directory inside of the `server` directory
    ​

- Create `pool.js` inside of the `modules` director
  - `const pg = require('pg')`
  - `const config = { database: 'databasename', host: 'localhost' port: 5432, };`
  - `const pool = new pg.Pool(config);`
  - `pool.on("connect", () => {console.log('connected to postgres');});`
  - `pool.on("error", (error) => {console.log('ERROR: Connecting to postgres', error);});`
  - `module.exports = pool;`
- `const pool = require('filepath to pool.js')` where needed
  ​

16. Create `routes` directory inside of the `server` directory
    Collapse
