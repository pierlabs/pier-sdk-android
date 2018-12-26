package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{status_boleto_response_description}}}
 **/
@ApiModel(description = "{{{status_boleto_response_description}}}")
public class StatusBoletoResponse  {
  
  @SerializedName("status")
  private String status = null;
  @SerializedName("data")
  private String data = null;

  
  /**
   * {{{status_boleto_dto_status_value}}}
   **/
  @ApiModelProperty(value = "{{{status_boleto_dto_status_value}}}")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{status_boleto_dto_data_value}}}
   **/
  @ApiModelProperty(value = "{{{status_boleto_dto_data_value}}}")
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
