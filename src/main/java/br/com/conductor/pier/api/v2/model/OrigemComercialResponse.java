package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ProdutoOrigemResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Origem Comercial
 **/
@ApiModel(description = "Origem Comercial")
public class OrigemComercialResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("produtosOrigem")
  private List<ProdutoOrigemResponse> produtosOrigem = null;
  @SerializedName("idEstabelecimento")
  private Long idEstabelecimento = null;
  @SerializedName("idTipoOrigemComercial")
  private Long idTipoOrigemComercial = null;
  @SerializedName("nomeTipoOrigemComercial")
  private String nomeTipoOrigemComercial = null;
  @SerializedName("idGrupoOrigemComercial")
  private Long idGrupoOrigemComercial = null;
  @SerializedName("nomeGrupoOrigemComercial")
  private String nomeGrupoOrigemComercial = null;
  @SerializedName("status")
  private Boolean status = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome da origem comercial
   **/
  @ApiModelProperty(required = true, value = "Nome da origem comercial")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o completa do nome da Origem Comercial
   **/
  @ApiModelProperty(required = true, value = "Descri\u00C3\u00A7\u00C3\u00A3o completa do nome da Origem Comercial")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Lista de  ProdutosOrigem associados \u00C3\u00A0 Origem comercial
   **/
  @ApiModelProperty(required = true, value = "Lista de  ProdutosOrigem associados \u00C3\u00A0 Origem comercial")
  public List<ProdutoOrigemResponse> getProdutosOrigem() {
    return produtosOrigem;
  }
  public void setProdutosOrigem(List<ProdutoOrigemResponse> produtosOrigem) {
    this.produtosOrigem = produtosOrigem;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Estabelecimento")
  public Long getIdEstabelecimento() {
    return idEstabelecimento;
  }
  public void setIdEstabelecimento(Long idEstabelecimento) {
    this.idEstabelecimento = idEstabelecimento;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Tipo da Origem Comercial
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Tipo da Origem Comercial")
  public Long getIdTipoOrigemComercial() {
    return idTipoOrigemComercial;
  }
  public void setIdTipoOrigemComercial(Long idTipoOrigemComercial) {
    this.idTipoOrigemComercial = idTipoOrigemComercial;
  }

  
  /**
   * Nome do Tipo da Origem Comercial
   **/
  @ApiModelProperty(required = true, value = "Nome do Tipo da Origem Comercial")
  public String getNomeTipoOrigemComercial() {
    return nomeTipoOrigemComercial;
  }
  public void setNomeTipoOrigemComercial(String nomeTipoOrigemComercial) {
    this.nomeTipoOrigemComercial = nomeTipoOrigemComercial;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Grupo a qual a Origem Comercial pertence
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Grupo a qual a Origem Comercial pertence")
  public Long getIdGrupoOrigemComercial() {
    return idGrupoOrigemComercial;
  }
  public void setIdGrupoOrigemComercial(Long idGrupoOrigemComercial) {
    this.idGrupoOrigemComercial = idGrupoOrigemComercial;
  }

  
  /**
   * Nome do Grupo a qual a Origem Comercial pertence
   **/
  @ApiModelProperty(required = true, value = "Nome do Grupo a qual a Origem Comercial pertence")
  public String getNomeGrupoOrigemComercial() {
    return nomeGrupoOrigemComercial;
  }
  public void setNomeGrupoOrigemComercial(String nomeGrupoOrigemComercial) {
    this.nomeGrupoOrigemComercial = nomeGrupoOrigemComercial;
  }

  
  /**
   * Status da origem comercial
   **/
  @ApiModelProperty(required = true, value = "Status da origem comercial")
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrigemComercialResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  produtosOrigem: ").append(produtosOrigem).append("\n");
    sb.append("  idEstabelecimento: ").append(idEstabelecimento).append("\n");
    sb.append("  idTipoOrigemComercial: ").append(idTipoOrigemComercial).append("\n");
    sb.append("  nomeTipoOrigemComercial: ").append(nomeTipoOrigemComercial).append("\n");
    sb.append("  idGrupoOrigemComercial: ").append(idGrupoOrigemComercial).append("\n");
    sb.append("  nomeGrupoOrigemComercial: ").append(nomeGrupoOrigemComercial).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


