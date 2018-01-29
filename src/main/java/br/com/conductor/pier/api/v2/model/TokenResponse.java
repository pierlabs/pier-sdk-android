package br.com.conductor.pier.api.v2.model;

import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do recurso token
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do recurso token")
public class TokenResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("token")
  private String token = null;
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
  private Date dataCriacao = null;
  @SerializedName("alteradoPor")
  private String alteradoPor = null;
  @SerializedName("dataModificacao")
  private Date dataModificacao = null;

  
  /**
   * C\u00C3\u00B3digo identificador do token
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do token")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Token
   **/
  @ApiModelProperty(value = "Token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da base
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da base")
  public Long getBase() {
    return base;
  }
  public void setBase(Long base) {
    this.base = base;
  }

  
  /**
   * Owner do token
   **/
  @ApiModelProperty(value = "Owner do token")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   * Status do token
   **/
  @ApiModelProperty(value = "Status do token")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o de quem criou o token
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o de quem criou o token")
  public String getCriadoPor() {
    return criadoPor;
  }
  public void setCriadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
  }

  
  /**
   * Data de cria\u00C3\u00A7\u00C3\u00A3o do token
   **/
  @ApiModelProperty(value = "Data de cria\u00C3\u00A7\u00C3\u00A3o do token")
  public Date getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(Date dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o de quem alterou o token
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o de quem alterou o token")
  public String getAlteradoPor() {
    return alteradoPor;
  }
  public void setAlteradoPor(String alteradoPor) {
    this.alteradoPor = alteradoPor;
  }

  
  /**
   * Data de modifica\u00C3\u00A7\u00C3\u00A3o do token
   **/
  @ApiModelProperty(value = "Data de modifica\u00C3\u00A7\u00C3\u00A3o do token")
  public Date getDataModificacao() {
    return dataModificacao;
  }
  public void setDataModificacao(Date dataModificacao) {
    this.dataModificacao = dataModificacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  token: ").append(token).append("\n");
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
