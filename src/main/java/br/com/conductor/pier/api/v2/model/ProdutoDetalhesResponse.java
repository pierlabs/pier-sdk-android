package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ProdutoDetalhes
 **/
@ApiModel(description = "ProdutoDetalhes")
public class ProdutoDetalhesResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("status")
  private Integer status = null;
  @SerializedName("idFantasiaBasica")
  private Long idFantasiaBasica = null;
  @SerializedName("fantasiaBasica")
  private String fantasiaBasica = null;
  @SerializedName("usoExterior")
  private Boolean usoExterior = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do Nome do Produto.
   **/
  @ApiModelProperty(required = true, value = "Descri\u00C3\u00A7\u00C3\u00A3o do Nome do Produto.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Representa o Status do Produto, onde: (\"0\": Inativo), (\"1\": Ativo).
   **/
  @ApiModelProperty(required = true, value = "Representa o Status do Produto, onde: (\"0\": Inativo), (\"1\": Ativo).")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Fantasia B\u00C3\u00A1sica (id) a qual o produto pertence.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Fantasia B\u00C3\u00A1sica (id) a qual o produto pertence.")
  public Long getIdFantasiaBasica() {
    return idFantasiaBasica;
  }
  public void setIdFantasiaBasica(Long idFantasiaBasica) {
    this.idFantasiaBasica = idFantasiaBasica;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o da Fantasia B\u00C3\u00A1sica a qual o produto pertence.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o da Fantasia B\u00C3\u00A1sica a qual o produto pertence.")
  public String getFantasiaBasica() {
    return fantasiaBasica;
  }
  public void setFantasiaBasica(String fantasiaBasica) {
    this.fantasiaBasica = fantasiaBasica;
  }

  
  /**
   * Par\u00C3\u00A2metro que indica se o produto est\u00C3\u00A1 habilitado para compras no exterior.
   **/
  @ApiModelProperty(value = "Par\u00C3\u00A2metro que indica se o produto est\u00C3\u00A1 habilitado para compras no exterior.")
  public Boolean getUsoExterior() {
    return usoExterior;
  }
  public void setUsoExterior(Boolean usoExterior) {
    this.usoExterior = usoExterior;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProdutoDetalhesResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  idFantasiaBasica: ").append(idFantasiaBasica).append("\n");
    sb.append("  fantasiaBasica: ").append(fantasiaBasica).append("\n");
    sb.append("  usoExterior: ").append(usoExterior).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
