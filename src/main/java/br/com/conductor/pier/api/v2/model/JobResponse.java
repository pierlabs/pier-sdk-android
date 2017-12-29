package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Job
 **/
@ApiModel(description = "Job")
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
   * Identificador do Job
   **/
  @ApiModelProperty(value = "Identificador do Job")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descricao do Job
   **/
  @ApiModelProperty(value = "Descricao do Job")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Script Groovy do Job
   **/
  @ApiModelProperty(value = "Script Groovy do Job")
  public String getGroovy() {
    return groovy;
  }
  public void setGroovy(String groovy) {
    this.groovy = groovy;
  }

  
  /**
   * Cron do Job
   **/
  @ApiModelProperty(value = "Cron do Job")
  public String getCron() {
    return cron;
  }
  public void setCron(String cron) {
    this.cron = cron;
  }

  
  /**
   * Status do Job no agendador de tarefas
   **/
  @ApiModelProperty(value = "Status do Job no agendador de tarefas")
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
