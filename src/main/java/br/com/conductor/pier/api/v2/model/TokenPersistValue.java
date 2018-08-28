package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{token_persist_description}}}
 **/
@ApiModel(description = "{{{token_persist_description}}}")
public class TokenPersistValue  {
  
  @SerializedName("token")
  private String token = null;
  @SerializedName("base")
  private Long base = null;
  @SerializedName("owner")
  private String owner = null;
  @SerializedName("criadoPor")
  private String criadoPor = null;
  @SerializedName("idAplicacao")
  private Long idAplicacao = null;

  
  /**
   * {{{token_dto_token_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{token_dto_token_value}}}")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  
  /**
   * {{{token_dto_base_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{token_dto_base_value}}}")
  public Long getBase() {
    return base;
  }
  public void setBase(Long base) {
    this.base = base;
  }

  
  /**
   * {{{token_dto_owner_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{token_dto_owner_value}}}")
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }

  
  /**
   * {{{token_dto_criado_por_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{token_dto_criado_por_value}}}")
  public String getCriadoPor() {
    return criadoPor;
  }
  public void setCriadoPor(String criadoPor) {
    this.criadoPor = criadoPor;
  }

  
  /**
   * {{{token_dto_id_application_value}}}
   **/
  @ApiModelProperty(value = "{{{token_dto_id_application_value}}}")
  public Long getIdAplicacao() {
    return idAplicacao;
  }
  public void setIdAplicacao(Long idAplicacao) {
    this.idAplicacao = idAplicacao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenPersistValue {\n");
    
    sb.append("  token: ").append(token).append("\n");
    sb.append("  base: ").append(base).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  criadoPor: ").append(criadoPor).append("\n");
    sb.append("  idAplicacao: ").append(idAplicacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
