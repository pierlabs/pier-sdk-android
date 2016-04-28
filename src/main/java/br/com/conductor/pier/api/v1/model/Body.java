package br.com.conductor.pier.api.v1.model;

import br.com.conductor.pier.api.v1.model.AuthToken;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class Body  {
  
  @SerializedName("AuthToken")
  private AuthToken authToken = null;
  public enum ActionEnum {
     CREATED,  UPDATED,  DELETED, 
  };
  @SerializedName("action")
  private ActionEnum action = null;
  @SerializedName("user")
  private String user = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public AuthToken getAuthToken() {
    return authToken;
  }
  public void setAuthToken(AuthToken authToken) {
    this.authToken = authToken;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Body {\n");
    
    sb.append("  authToken: ").append(authToken).append("\n");
    sb.append("  action: ").append(action).append("\n");
    sb.append("  user: ").append(user).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


