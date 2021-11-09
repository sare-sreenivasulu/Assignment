LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master|MERGING)
$ git checkout html-assignments
Switched to branch 'html-assignments'

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (html-assignments)
$ git status
On branch html-assignments
nothing to commit, working tree clean

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (html-assignments)
$ git checkout master
Switched to branch 'master'

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git log
commit b70031f4fc30c3520d68c94c7de850a8153862d7 (HEAD -> master)
Author: Venkatesh <sabavath.venky2016@gmail.com>
Date:   Sun Nov 7 14:55:53 2021 +0530

     second rearrangement

commit 81dcb9fe253e4228e61d81fa382cafed0dfc6e8b
Author: Venkatesh <sabavath.venky2016@gmail.com>
Date:   Sun Nov 7 14:47:52 2021 +0530

    this is my first txt file

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git merge html-assignments
hint: Waiting for your editor to close the file... error: There was a problem with the editor 'vi'.
Not committing merge; use 'git commit' to complete the merge.

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master|MERGING)
$ git log
commit b70031f4fc30c3520d68c94c7de850a8153862d7 (HEAD -> master)
Author: Venkatesh <sabavath.venky2016@gmail.com>
Date:   Sun Nov 7 14:55:53 2021 +0530

     second rearrangement

commit 81dcb9fe253e4228e61d81fa382cafed0dfc6e8b
Author: Venkatesh <sabavath.venky2016@gmail.com>
Date:   Sun Nov 7 14:47:52 2021 +0530

    this is my first txt file

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master|MERGING)
$ git branch -d html-assignments
error: The branch 'html-assignments' is not fully merged.
If you are sure you want to delete it, run 'git branch -D html-assignments'.

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master|MERGING)
$ git checkout html-assignments
Switched to branch 'html-assignments'

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (html-assignments)
$ git status
On branch html-assignments
Changes not staged for commit:
  (use "git add <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        modified:   index.html

no changes added to commit (use "git add" and/or "git commit -a")

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (html-assignments)
$ git add .

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (html-assignments)
$ git commit -m "made my chnages"
[html-assignments 5812729] made my chnages
 1 file changed, 1 insertion(+), 1 deletion(-)

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (html-assignments)
$ git checkout master
Switched to branch 'master'

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git merge html-assignments
hint: Waiting for your editor to close the file...       0 [sig] bash 591! sigpacket::process: Suppressing signal 18 to win32 process (pid 3972)
1157194 [sig] bash 591! sigpacket::process: Suppressing signal 18 to win32 process (pid 3972)
2443851 [sig] bash 591! sigpacket::process: Suppressing signal 18 to win32 process (pid 3972)
Merge made by the 'recursive' strategy.
 index.html | 2 ++
 1 file changed, 2 insertions(+)
 create mode 100644 index.html

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git branch -d html-assignments
Deleted branch html-assignments (was 5812729).

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git branch css-assignments

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git checkout css-assignments
Switched to branch 'css-assignments'

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (css-assignments)
$ touch first.css

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (css-assignments)
$ git add .

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (css-assignments)
$ git commit -m "css changing the content"
[css-assignments 767765d] css changing the content
 1 file changed, 1 insertion(+)
 create mode 100644 first.css

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (css-assignments)
$ git add .

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (css-assignments)
$ git commit -m"made some changes"
[css-assignments 9229ec3] made some changes
 1 file changed, 2 insertions(+), 1 deletion(-)

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (css-assignments)
$ git checkout master
Switched to branch 'master'

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git add .

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git commit -m "changes in readme"
[master 590b3dc] changes in readme
 1 file changed, 2 insertions(+), 1 deletion(-)

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git checkout css-assignments
Switched to branch 'css-assignments'

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (css-assignments)
$ git add .

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (css-assignments)
$ git commit -m"changes in css"
[css-assignments 313b8f4] changes in css
 1 file changed, 1 insertion(+)

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (css-assignments)
$ git checkout master
Switched to branch 'master'

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git merge css-assignments
Auto-merging README.txt
CONFLICT (content): Merge conflict in README.txt
Automatic merge failed; fix conflicts and then commit the result.

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master|MERGING)
$ git status
On branch master
You have unmerged paths.
  (fix conflicts and run "git commit")
  (use "git merge --abort" to abort the merge)

Changes to be committed:
        new file:   first.css

Unmerged paths:
  (use "git add <file>..." to mark resolution)
        both modified:   README.txt


LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master|MERGING)
$ git add .

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master|MERGING)
$ git commit -m "conflicts happened"
[master 214a6ec] conflicts happened

LENOVO L440@DESKTOP-HGGT7DC MINGW64 ~/Assignments (master)
$ git branch -d css-assignments
Deleted branch css-assignments (was 313b8f4).


