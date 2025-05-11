# DonInf2
Boiler plate code for the DonInf2 course. You can freely use this code to start your project.

## Setup

First each team member needs a github account.

### 1. Setting up your group's repository on Github

We will use a github specific functionnality to perform that.
it is called a "fork" which is a fresh new copy of an existing repository.

Only one member per group should do that
- Open the github page of this repository https://github.com/xgo-work/DonInf2-start-2025/
-


One member will create a repository on github
- Go to your account's page
- click on the **Repositories** section
- click the green button **New**
- Fill the form to create your new repository

Then add your team mates as contributors. To do that, on your repository page
- Go to Settings
- Collaborators and team
- (Manage access) > Add your teammates as contributors

### 2. Setup your local workspace
Each team member now has to configure his local workspace.

An easy option is to use Github Desktop application
- Download the app and install it
- Open it and log with your github account
- At the top left click **Add** and choose **Clone Repository**
- Pick your newly created repository and choose a directory to clone it on your machine

In the directory you chose you should now have a new directory named after you repository name.

### 2.1 Optional install command line tools

Github desktop has an option to install the command line tools in the GithubDesktop top left menu select the "Install Command Line Tool..."
(I did not test it but it should work :))

## 3. Get the starter kit code
**Only one team member does that !!!**
- download the started kit code here https://github.com/xgo-work/DonInf2-start-2025/archive/refs/heads/main.zip
- open an explorer window in your cloned repository
- unzip it in created repository
- add all the new files (in your favorite IDE) or with the command line opened in your git directory `git add .`
- create a commit `git commit -m "some meaningful message"`
- push the commit `git push` (this will push changes to your github repository)

## 3.1
The other team mates can now fetch the first changes but running `git pull` in their repository or using Github Desktop by performing a **fetch**

## Running the project
Use your favorite IDE to run the project.

Alternatively, you can run the project with the `buildAndRun.sh` script. Open a terminal or console in the repository directory and run the following command

```
./buildAndRun.sh
```

To run the script, you need java installed on your computer.

If running a Windows computer you also need bash shell installed (for example Git For Windows https://gitforwindows.org/).

