TypeScript Getting Started 

TypeScript Compiler 

  ** TypeScript is transpiled into JavaScript using a compiler.

** TypeScript being converted into JavaScript means it runs anywhere that JavaScript runs! 


Installing the Compiler 

  ** TypeScript has an Official compiler which can be installed through npm.

** Learn more about npm, and how to get stared here: What is npm? 
    >> https://www.w3schools.com/whatis/whatis_npm.asp

---

** Withing your npm project, run the following command to install the compiler:

  cmd: npm install typescript --save--dev 

** Which should give you an output similer to:

  cmd:>>>:  added 1 package, and audited 2 packages in 2s
            found 0 vulnerabilities 

** The compiler is installed in the node_modules directory and can be run with: npx tsc.

  cmd: npx tsc 

** Which should give you an output similar to:

  cmd:>>>:  Version 4.5.5 
            tsc: The TypeScript Compiler - Version 4.5.5 

** Followed by a list of all Common Commands.

-----
-----

Configuring the compiler

  ** By default the TypeScript compiler will print a help message when run in an empty project.

  ** The compiler can be configured using a tsconfig.json file.

  ** You can have TypeScript create tsconfig.json with the recommended settings with:

    cmd: npx tsc --init 

  ** Which should give you an output similer to: 

    cmd:>>>: 
        Created a new tsconfig.json with:
        TS
          target: es2016
          module: commonjs
          strict: true
          esModuleInterop: true
          skipLibCheck: true
          forceConsistentCasingInFileNames: true
        
        You can learn more at https://aka.ms/tsconfig.json

  ** Here is an example of more things you could add to the tsconfig.json file: 

          {
            "include": ["src"],
            "compilerOptions": {
              "outDir": "./build"
            }
          }

  ** You can open the file in an editor to add options. This will configure the TypeScrit compiler to 
  transpile TypeScript files located in teh src/ direcotry of your project, into JavaScript files in 
  the build/ directory.
  

** This is one way to quickly get started with TypeScript. There are many other options availabel such as a create-react-app template, a node starter project, and a webpack plugin.

    >>  https://create-react-app.dev/docs/adding-typescript/
    >> https://github.com/microsoft/TypeScript-Node-Starter
    >> https://webpack.js.org/guides/typescript/
    
---
