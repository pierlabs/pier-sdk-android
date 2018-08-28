package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{token_update_description}}}
 **/
@ApiModel(description = "{{{token_update_description}}}")
public class TokenUpdateValue  {
  
  @SerializedName("base")
  private Long base = null;
  @SerializedName("owner")
  private String owner = null;
  @SerializedName("criadoPor")
  private String criadoPor = null;
  @SerializedName("alteradoPor")
  private String alteradoPor = null;
  @SerializedName("idAplicacao")
  private Long idAplicacao = null;

  
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
    sb.append("class TokenUpdateValue {\n");
    
    sb.append("  base: ").append(base).append("\n");
    sb.append("  owner: ").append(owner).append("\n");
    sb.append("  criadoPor: ").append(criadoPor).append("\n");
    sb.append("  alteradoPor: ").append(alteradoPor).append("\n");
    sb.append("  idAplicacao: ").append(idAplicacao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
