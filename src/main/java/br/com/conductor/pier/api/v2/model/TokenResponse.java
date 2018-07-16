package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{token_response_description}}}
 **/
@ApiModel(description = "{{{token_response_description}}}")
public class TokenResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("base")
  private Long base = null;
  @SerializedName("owner")
  private String owner = null;
  public enum StatusEnum {
     ACTIVE,  REVOKED,  DELETED, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("criadoPor")
  private String criadoPor = null;
  @SerializedName("dataCriacao")
  private String dataCriacao = null;
  @SerializedName("alteradoPor")
  private String alteradoPor = null;
  @SerializedName("dataModificacao")
  private String dataModificacao = null;

  
  /**
   * {{{token_dto_id_value}}}
   **/
  @ApiModelProperty(value = "{{{token_dto_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{token_dto_base_value}}}
   **/
  @ApiModelProperty(value = "{{{token_dto_base_value}}}")
  public Long getBase() {
    return base;
  }
  public void setBase(Long base) {
    this.base = base;
  }

  
  /**
   * {{{token_dto_owner_value}}}
   **/
  @ApiModelProperty(value = "{{{token_dto_owner_value}}}")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   * {{{token_dto_status_value}}}
   **/
  @ApiModelProperty(value = "{{{token_dto_status_value}}}")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * {{{token_dto_criado_por_value}}}
   **/
  @ApiModelProperty(value = "{{{token_dto_criado_por_value}}}")
  public String getCriadoPor() {
    return criadoPor;
  }
  public void setCriadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
  }

  
  /**
   * {{{token_dto_data_criacao_value}}}
   **/
  @ApiModelProperty(value = "{{{token_dto_data_criacao_value}}}")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * {{{token_dto_alterado_por_value}}}
   **/
  @ApiModelProperty(value = "{{{token_dto_alterado_por_value}}}")
  public String getAlteradoPor() {
    return alteradoPor;
  }
  public void setAlteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
  }

  
  /**
   * {{{token_dto_data_modificacao_value}}}
   **/
  @ApiModelProperty(value = "{{{token_dto_data_modificacao_value}}}")
  public String getDataModificacao() {
    return dataModificacao;
  }
  public void setDataModificacao(String dataModificacao) {
    this.dataModificacao = dataModificacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  base: ").append(base).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  criadoPor: ").append(criadoPor).append("\n");
    sb.append("  dataCriacao: ").append(dataCriacao).append("\n");
    sb.append("  alteradoPor: ").append(alteradoPor).append("\n");
    sb.append("  dataModificacao: ").append(dataModificacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


