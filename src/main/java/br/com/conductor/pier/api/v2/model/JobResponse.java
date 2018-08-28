package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{job_response_description}}}
 **/
@ApiModel(description = "{{{job_response_description}}}")
public class JobResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("groovy")
  private String groovy = null;
  @SerializedName("cron")
  private String cron = null;
  public enum StatusEnum {
     INATIVO,  ATIVO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;

  
  /**
   * {{{job_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{job_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{job_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{job_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{job_response_groovy_value}}}
   **/
  @ApiModelProperty(value = "{{{job_response_groovy_value}}}")
  public String getGroovy() {
    return groovy;
  }
  public void setGroovy(String groovy) {
    this.groovy = groovy;
  }

  
  /**
   * {{{job_response_cron_value}}}
   **/
  @ApiModelProperty(value = "{{{job_response_cron_value}}}")
  public String getCron() {
    return cron;
  }
  public void setCron(String cron) {
    this.cron = cron;
  }

  
  /**
   * {{{job_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{job_response_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  groovy: ").append(groovy).append("\n");
    sb.append("  cron: ").append(cron).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
