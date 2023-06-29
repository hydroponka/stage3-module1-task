package com.mjc.school.repository.model.data;

import com.mjc.school.repository.model.AuthorModel;
import com.mjc.school.repository.utils.Utils;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;

public class AuthorData {
    private static final String AUTHORS_FILE_NAME = "Authors";
    private static AuthorData authorData;
    private List<AuthorModel> authorList;

    private AuthorData(){
        this.init();
    }
    public static AuthorData getAuthorData() {
        if (authorData == null) {
            authorData = new AuthorData();
        }

        return authorData;
    }

    private void init() {
        this.authorList = new ArrayList<>();
        for (long id = 1L; id <= 20L; id++){
            this.authorList.add(new AuthorModel(id, Utils.getRandomContentByFilePath("authors")));
        }
    }
    public List<AuthorModel> getAuthorList(){
        return this.authorList;
    }
}
