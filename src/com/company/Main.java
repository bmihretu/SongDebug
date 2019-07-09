package com.company;

import java.util.ArrayList;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {

            ArrayList<Song> songs = new ArrayList<>();
            Scanner keybd = new Scanner(System.in);

            for (int i = 0; i< 3;i++){
                System.out.println("Enter an artist name: ");
                String artist = keybd.nextLine();
                System.out.println("Enter a song name: ");
                String title = keybd.nextLine();
                Song s = new Song();
                s.setArtist(artist);
                s.setTitle(title);
                songs.add(s);
            }

            //print statement
            for(Song s: songs){
                System.out.println(s.display());
            }
            String titleToFind = "Purple Rain";
            for (Song s: songs){
                if (s.getTitle().equals(titleToFind)){
                    System.out.printf("I found %s \r\n",s.display());
                }
            }
        }
    }

