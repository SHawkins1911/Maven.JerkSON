package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemParser {
    Map<String, String> groceryMap = new HashMap<>();
    StringBuilder stringBuilder = new StringBuilder();
    List<Item> groceryList = new ArrayList<>();


    String regex1 = "(\\b[;]a-z[:@^*%]a-z[;]\\b)";



    public ItemParser(){}
    public List<Item> parseItemList(String valueToParse) {
        Pattern p1 = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE);
        Matcher m1 = p1.matcher(valueToParse);

        while(m1.find()){
            groceryList.add();
        }


    }

    public Item parseSingleItem(String singleItem) throws ItemParseException {
        return null;
    }
}
