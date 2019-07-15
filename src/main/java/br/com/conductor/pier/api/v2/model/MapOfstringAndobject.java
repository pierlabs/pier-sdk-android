package br.com.conductor.pier.api.v2.model;

import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class MapOfstringAndobject extends HashMap<String, Object> {
  

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MapOfstringAndobject {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
