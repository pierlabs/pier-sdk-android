package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{conta_response_description}}}
 **/
@ApiModel(description = "{{{conta_response_description}}}")
public class ContaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idStatusConta")
  private Long idStatusConta = null;
  @SerializedName("diaVencimento")
  private Integer diaVencimento = null;
  @SerializedName("melhorDiaCompra")
  private Integer melhorDiaCompra = null;
  @SerializedName("dataStatusConta")
  private String dataStatusConta = null;
  @SerializedName("dataCadastro")
  private String dataCadastro = null;
  @SerializedName("dataUltimaAlteracaoVencimento")
  private String dataUltimaAlteracaoVencimento = null;
  @SerializedName("valorRenda")
  private BigDecimal valorRenda = null;
  @SerializedName("idProposta")
  private Long idProposta = null;
  public enum FuncaoAtivaEnum {
     DEBITO_CREDITO,  CREDITO, 
  };
  @SerializedName("funcaoAtiva")
  private FuncaoAtivaEnum funcaoAtiva = null;

  
  /**
   * {{{conta_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{conta_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{conta_response_id_origem_comercial_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_id_origem_comercial_value}}}")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * {{{conta_response_id_pessoa_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_id_pessoa_value}}}")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * {{{conta_response_id_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_id_status_conta_value}}}")
  public Long getIdStatusConta() {
    return idStatusConta;
  }
  public void setIdStatusConta(Long idStatusConta) {
    this.idStatusConta = idStatusConta;
  }

  
  /**
   * {{{conta_response_dia_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_dia_vencimento_value}}}")
  public Integer getDiaVencimento() {
    return diaVencimento;
  }
  public void setDiaVencimento(Integer diaVencimento) {
    this.diaVencimento = diaVencimento;
  }

  
  /**
   * {{{conta_response_melhor_dia_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_melhor_dia_compra_value}}}")
  public Integer getMelhorDiaCompra() {
    return melhorDiaCompra;
  }
  public void setMelhorDiaCompra(Integer melhorDiaCompra) {
    this.melhorDiaCompra = melhorDiaCompra;
  }

  
  /**
   * {{{conta_response_data_status_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_data_status_conta_value}}}")
  public String getDataStatusConta() {
    return dataStatusConta;
  }
  public void setDataStatusConta(String dataStatusConta) {
    this.dataStatusConta = dataStatusConta;
  }

  
  /**
   * {{{conta_response_data_cadastro_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_data_cadastro_value}}}")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * {{{conta_response_data_ultima_alteracao_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_data_ultima_alteracao_vencimento_value}}}")
  public String getDataUltimaAlteracaoVencimento() {
    return dataUltimaAlteracaoVencimento;
  }
  public void setDataUltimaAlteracaoVencimento(String dataUltimaAlteracaoVencimento) {
    this.dataUltimaAlteracaoVencimento = dataUltimaAlteracaoVencimento;
  }

  
  /**
   * {{{conta_response_valor_renda_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_valor_renda_value}}}")
  public BigDecimal getValorRenda() {
    return valorRenda;
  }
  public void setValorRenda(BigDecimal valorRenda) {
    this.valorRenda = valorRenda;
  }

  
  /**
   * {{{conta_response_id_proposta}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_id_proposta}}}")
  public Long getIdProposta() {
    return idProposta;
  }
  public void setIdProposta(Long idProposta) {
    this.idProposta = idProposta;
  }

  
  /**
   * {{{conta_response_funcao_ativa_value}}}
   **/
  @ApiModelProperty(value = "{{{conta_response_funcao_ativa_value}}}")
  public FuncaoAtivaEnum getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(FuncaoAtivaEnum funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idStatusConta: ").append(idStatusConta).append("\n");
    sb.append("  diaVencimento: ").append(diaVencimento).append("\n");
    sb.append("  melhorDiaCompra: ").append(melhorDiaCompra).append("\n");
    sb.append("  dataStatusConta: ").append(dataStatusConta).append("\n");
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  dataUltimaAlteracaoVencimento: ").append(dataUltimaAlteracaoVencimento).append("\n");
    sb.append("  valorRenda: ").append(valorRenda).append("\n");
    sb.append("  idProposta: ").append(idProposta).append("\n");
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
