package com.hanz.hilongosonline.models;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Post {

    public String title;
    public User author;


}
