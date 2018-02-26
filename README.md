# music-genre-classifier
classify music based on different genres
This project is about genre based music classification. Music is divided into various genres(hiphop , pop , disco , jazz , classical , etc.)
so, it is required to classify the music based on various genres , in order , to find which genre you like the most.

There are various music features such as rhythmic , spectral , tempo , etc which are used to classify it in different genres.
I have used GTZAN dataset (well labeled music files based on genres) for my project. Every music file is 30 sec long and 
has been sampled at 14400Hz which gives us with thousands of features for just one song . 
These thousands of features for just one song has been reduced to just 39 features through feature reduction techniques by extracting the 
most features required to classify the song.

I have used 5 to 6 different classifiers(ADABOOST , Decision Tree , SVM , etc.) and I found SVM to be a best classifier with accuracy 
of 67%.
