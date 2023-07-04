// This file is used to write custom JavaScript code for the frontend application

// Function to toggle visibility of solved problems
function toggleSolvedProblems() {
    var solvedProblems = document.getElementById('solvedProblems');
    if (solvedProblems.style.display === "none") {
        solvedProblems.style.display = "block";
    } else {
        solvedProblems.style.display = "none";
    }
}

// Function to toggle visibility of new problems
function toggleNewProblems() {
    var newProblems = document.getElementById('newProblems');
    if (newProblems.style.display === "none") {
        newProblems.style.display = "block";
    } else {
        newProblems.style.display = "none";
    }
}

// Function to toggle visibility of explore feature
function toggleExploreFeature() {
    var exploreFeature = document.getElementById('exploreFeature');
    if (exploreFeature.style.display === "none") {
        exploreFeature.style.display = "block";
    } else {
        exploreFeature.style.display = "none";
    }
}