package br.com.conductor.pier.api.v2.model;

import java.util.HashMap;
import java.util.Map;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class MapOfstringAndstring extends HashMap<String, String> {
  

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapOfstringAndstring {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


