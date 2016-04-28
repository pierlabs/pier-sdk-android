package br.com.conductor.pier.api.v1.model;

import br.com.conductor.pier.api.v1.model.Body;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class BodyAccessToken  {
  
  @SerializedName("body")
  private Body body = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Body getBody() {
    return body;
  }
  public void setBody(Body body) {
    this.body = body;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BodyAccessToken {\n");
    
    sb.append("  body: ").append(body).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


