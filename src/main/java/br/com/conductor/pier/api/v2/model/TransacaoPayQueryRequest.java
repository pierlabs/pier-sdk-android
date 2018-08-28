package br.com.conductor.pier.api.v2.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{transacao_pay_query_request_description}}}
 **/
@ApiModel(description = "{{{transacao_pay_query_request_description}}}")
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
   * {{{transacao_pay_generic_request_numero_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_generic_request_numero_cartao_value}}}")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{transacao_pay_generic_request_id_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_generic_request_id_cartao_value}}}")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * {{{transacao_pay_query_request_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{transacao_pay_query_request_origem_value}}}")
  public String getOrigem() {
    return origem;
  }
  public void setOrigem(String origem) {
    this.origem = origem;
  }

  
  /**
   * {{{global_menssagem_sort_sort}}}
   **/
  @ApiModelProperty(value = "{{{global_menssagem_sort_sort}}}")
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
