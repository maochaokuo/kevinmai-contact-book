# kevinmai-contact-book

## [1] Reitit Ring Set Up 
step 1
```
clj -A:run
```
will show hello world

step 2
- make default rest api, port 4000
- again, clj -A:run, see Server Started
  to confirm
- use Insomia or postman, to test get
  http://localhost:4000/api
- will get "ok"

step3
- add atom server
- add stop-server
- in vscode, Ctrl-Alt-c Ctrl-Alt-j, choose deps.edn, 
  then no option, will enter REPL, wait until Jack-in
  done

## change log
### 2021/7/11
- make default rest api

### 2021/7/10
- initial commit 
- show Hello World