package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the ticket status resource response
 **/
@ApiModel(description = "Representation of the ticket status resource response")
public class StatusBoletoResponse  {
  
  @SerializedName("status")
  private String status = null;
  @SerializedName("data")
  private String data = null;

  
  /**
   * Description of the CNAB summarized status of the ticket
   **/
  @ApiModelProperty(value = "Description of the CNAB summarized status of the ticket")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Date the status was set
   **/
  @ApiModelProperty(value = "Date the status was set")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusBoletoResponse {\n");
    
    sb.append("  status: ").append(status).append("\n");
    sb.append("  data: ").append(data).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
