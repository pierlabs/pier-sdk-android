package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{proposta_response_description}}}
 **/
@ApiModel(description = "{{{proposta_response_description}}}")
public class PropostaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("dataCadastramento")
  private String dataCadastramento = null;

  
  /**
   * {{{proposta_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{proposta_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{proposta_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{proposta_response_status_value}}}")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * {{{proposta_response_data_cadastramento_value}}}
   **/
  @ApiModelProperty(value = "{{{proposta_response_data_cadastramento_value}}}")
  public String getDataCadastramento() {
    return dataCadastramento;
  }
  public void setDataCadastramento(String dataCadastramento) {
    this.dataCadastramento = dataCadastramento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropostaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataCadastramento: ").append(dataCadastramento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
