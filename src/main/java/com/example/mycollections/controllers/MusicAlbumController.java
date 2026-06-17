package com.example.mycollections.controllers;
import com.example.mycollections.models.MusicAlbum;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class MusicAlbumController {

    private final List<MusicAlbum> musicAlbums = new ArrayList<>() {{
        add(new MusicAlbum("Dookie", "Green Day", 1997, 14));
        add(new MusicAlbum("Jagged Little Pill", "Alanis Morisette", 2003, 22));
        add(new MusicAlbum("Me Against the World", "Tupac", 2012, 127));
    }};

    @GetMapping("/json")
    public List<MusicAlbum> getMusicAlbumJson() {
        return musicAlbums;
    }

    @GetMapping("/html")
    public String getMusicAlbumsHtml() {
        String musicAlbumList = "<ul>";
        for (MusicAlbum musicAlbum : musicAlbums) {
            musicAlbumList += "<li>" + musicAlbum + "</li>";
        }
        musicAlbumList += "</ul>";

        return """
                <html>
                    <body>
                        <h1>Music Albums</h1>
                        <ul>
                """ +
                musicAlbumList +
                """
                        </ul>
                    </body>
                """;
    }

}
