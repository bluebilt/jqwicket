# jqwicket

This is a clone of the jqwicket project hosted at
http://code.google.com/p/jqwicket/.

## About this clone

It was created using `svn2git`.

Currently (2012-05-03) there are no bugfixes happening on the original project
because the original author does not have the time. I am implementing bugfixes
in this clone. If you fork this clone and do further bugfixes, please send me
a pull request.

This is not intended to be a fork of the jqwicket project. I do not intend to
implement new features. This clone is intended to provide the jqwicket source
in a Git repo, and to provide bugfixes to the code hosted at Google Code.

Ultimately, I these bugfixes should be implemented jqwicket proper, when the
original author has time to work on the project again.

## About the branches

The `trunk` branch was created by `svn2git`. It reflects the state of the SVN
`trunk` branch. No changes will be committed on this branch in Git. I will keep
this branch up to date by periodically pulling SVN changes into it. It will be
merged into `master`.

The `master` branch is the same as the `trunk` branch, but includes this README
file.

The `maint/0.8` branch is a maintenance branch to bugfixes for version 0.8.
This branch is not merged into any other branch.

## Releases

I do not plan to do any releases from this repo.
