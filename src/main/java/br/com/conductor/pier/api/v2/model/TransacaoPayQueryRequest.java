package br.com.conductor.pier.api.v2.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o do recurso de consultar conta
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o do recurso de consultar conta")
public class TransacaoPayQueryRequest  {
  
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("origem")
  private String origem = null;
  @SerializedName("sort")
  private List<String> sort = null;

  
  /**
   * Numero do cartao (criptografado)
   **/
  @ApiModelProperty(value = "Numero do cartao (criptografado)")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Id do cart\u00C3\u00A3o
   **/
  @ApiModelProperty(value = "Id do cart\u00C3\u00A3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Origem
   **/
  @ApiModelProperty(value = "Origem")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.
   **/
  @ApiModelProperty(value = "Tipo de ordena\u00C3\u00A7\u00C3\u00A3o dos registros.")
  public List<String> getSort() {
    return sort;
  }
  public void setSort(List<String> sort) {
    this.sort = sort;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacaoPayQueryRequest {\n");
    
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  origem: ").append(origem).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
