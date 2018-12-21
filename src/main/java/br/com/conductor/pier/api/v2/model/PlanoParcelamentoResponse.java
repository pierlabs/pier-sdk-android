package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{plano_parcelamento_response_description}}}
 **/
@ApiModel(description = "{{{plano_parcelamento_response_description}}}")
public class PlanoParcelamentoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("dataFechamentoFatura")
  private String dataFechamentoFatura = null;
  @SerializedName("dataVencimentoPadrao")
  private String dataVencimentoPadrao = null;
  @SerializedName("valorTotalFatura")
  private BigDecimal valorTotalFatura = null;
  @SerializedName("quantidadeParcelas")
  private Integer quantidadeParcelas = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("valorEntrada")
  private BigDecimal valorEntrada = null;
  @SerializedName("taxaRefinanciamento")
  private BigDecimal taxaRefinanciamento = null;
  @SerializedName("custoEfetivoTotal")
  private BigDecimal custoEfetivoTotal = null;
  @SerializedName("valorTotalRefinanciamento")
  private BigDecimal valorTotalRefinanciamento = null;
  @SerializedName("valorIOF")
  private BigDecimal valorIOF = null;
  @SerializedName("valorTAC")
  private BigDecimal valorTAC = null;
  @SerializedName("statusAdesao")
  private Integer statusAdesao = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataProcessamentoAdesao")
  private String dataProcessamentoAdesao = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idServicoTipo")
  private Long idServicoTipo = null;
  @SerializedName("descricaoServicoTipo")
  private String descricaoServicoTipo = null;
  @SerializedName("comEntrada")
  private Boolean comEntrada = null;
  @SerializedName("nomeCampanha")
  private String nomeCampanha = null;

  
  /**
   * {{{plano_parcelamento_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{plano_parcelamento_response_data_fechamento_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_data_fechamento_fatura_value}}}")
  public String getDataFechamentoFatura() {
    return dataFechamentoFatura;
  }
  public void setDataFechamentoFatura(String dataFechamentoFatura) {
    this.dataFechamentoFatura = dataFechamentoFatura;
  }

  
  /**
   * {{{plano_parcelamento_response_data_vencimento_padrao_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_data_vencimento_padrao_value}}}")
  public String getDataVencimentoPadrao() {
    return dataVencimentoPadrao;
  }
  public void setDataVencimentoPadrao(String dataVencimentoPadrao) {
    this.dataVencimentoPadrao = dataVencimentoPadrao;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_total_fatura_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_valor_total_fatura_value}}}")
  public BigDecimal getValorTotalFatura() {
    return valorTotalFatura;
  }
  public void setValorTotalFatura(BigDecimal valorTotalFatura) {
    this.valorTotalFatura = valorTotalFatura;
  }

  
  /**
   * {{{plano_parcelamento_response_quantidade_parcelas_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_quantidade_parcelas_value}}}")
  public Integer getQuantidadeParcelas() {
    return quantidadeParcelas;
  }
  public void setQuantidadeParcelas(Integer quantidadeParcelas) {
    this.quantidadeParcelas = quantidadeParcelas;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_valor_parcela_value}}}")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_valor_entrada_value}}}")
  public BigDecimal getValorEntrada() {
    return valorEntrada;
  }
  public void setValorEntrada(BigDecimal valorEntrada) {
    this.valorEntrada = valorEntrada;
  }

  
  /**
   * {{{plano_parcelamento_response_taxa_refinanciamento_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_taxa_refinanciamento_value}}}")
  public BigDecimal getTaxaRefinanciamento() {
    return taxaRefinanciamento;
  }
  public void setTaxaRefinanciamento(BigDecimal taxaRefinanciamento) {
    this.taxaRefinanciamento = taxaRefinanciamento;
  }

  
  /**
   * {{{plano_parcelamento_response_custo_efetivo_total_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_custo_efetivo_total_value}}}")
  public BigDecimal getCustoEfetivoTotal() {
    return custoEfetivoTotal;
  }
  public void setCustoEfetivoTotal(BigDecimal custoEfetivoTotal) {
    this.custoEfetivoTotal = custoEfetivoTotal;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_total_refinanciamento_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_valor_total_refinanciamento_value}}}")
  public BigDecimal getValorTotalRefinanciamento() {
    return valorTotalRefinanciamento;
  }
  public void setValorTotalRefinanciamento(BigDecimal valorTotalRefinanciamento) {
    this.valorTotalRefinanciamento = valorTotalRefinanciamento;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_i_o_f_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_valor_i_o_f_value}}}")
  public BigDecimal getValorIOF() {
    return valorIOF;
  }
  public void setValorIOF(BigDecimal valorIOF) {
    this.valorIOF = valorIOF;
  }

  
  /**
   * {{{plano_parcelamento_response_valor_t_a_c_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_valor_t_a_c_value}}}")
  public BigDecimal getValorTAC() {
    return valorTAC;
  }
  public void setValorTAC(BigDecimal valorTAC) {
    this.valorTAC = valorTAC;
  }

  
  /**
   * {{{plano_parcelamento_response_status_adesao_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_status_adesao_value}}}")
  public Integer getStatusAdesao() {
    return statusAdesao;
  }
  public void setStatusAdesao(Integer statusAdesao) {
    this.statusAdesao = statusAdesao;
  }

  
  /**
   * {{{plano_parcelamento_response_data_inclusao_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_data_inclusao_value}}}")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{plano_parcelamento_response_data_processamento_adesao_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_data_processamento_adesao_value}}}")
  public String getDataProcessamentoAdesao() {
    return dataProcessamentoAdesao;
  }
  public void setDataProcessamentoAdesao(String dataProcessamentoAdesao) {
    this.dataProcessamentoAdesao = dataProcessamentoAdesao;
  }

  
  /**
   * {{{plano_parcelamento_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{plano_parcelamento_response_id_servico_tipo_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_id_servico_tipo_value}}}")
  public Long getIdServicoTipo() {
    return idServicoTipo;
  }
  public void setIdServicoTipo(Long idServicoTipo) {
    this.idServicoTipo = idServicoTipo;
  }

  
  /**
   * {{{plano_parcelamento_response_descricao_servico_tipo_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_descricao_servico_tipo_value}}}")
  public String getDescricaoServicoTipo() {
    return descricaoServicoTipo;
  }
  public void setDescricaoServicoTipo(String descricaoServicoTipo) {
    this.descricaoServicoTipo = descricaoServicoTipo;
  }

  
  /**
   * {{{plano_parcelamento_response_com_entrada_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_com_entrada_value}}}")
  public Boolean getComEntrada() {
    return comEntrada;
  }
  public void setComEntrada(Boolean comEntrada) {
    this.comEntrada = comEntrada;
  }

  
  /**
   * {{{plano_parcelamento_response_nome_campanha_value}}}
   **/
  @ApiModelProperty(value = "{{{plano_parcelamento_response_nome_campanha_value}}}")
  public String getNomeCampanha() {
    return nomeCampanha;
  }
  public void setNomeCampanha(String nomeCampanha) {
    this.nomeCampanha = nomeCampanha;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoParcelamentoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  dataFechamentoFatura: ").append(dataFechamentoFatura).append("\n");
    sb.append("  dataVencimentoPadrao: ").append(dataVencimentoPadrao).append("\n");
    sb.append("  valorTotalFatura: ").append(valorTotalFatura).append("\n");
    sb.append("  quantidadeParcelas: ").append(quantidadeParcelas).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  valorEntrada: ").append(valorEntrada).append("\n");
    sb.append("  taxaRefinanciamento: ").append(taxaRefinanciamento).append("\n");
    sb.append("  custoEfetivoTotal: ").append(custoEfetivoTotal).append("\n");
    sb.append("  valorTotalRefinanciamento: ").append(valorTotalRefinanciamento).append("\n");
    sb.append("  valorIOF: ").append(valorIOF).append("\n");
    sb.append("  valorTAC: ").append(valorTAC).append("\n");
    sb.append("  statusAdesao: ").append(statusAdesao).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataProcessamentoAdesao: ").append(dataProcessamentoAdesao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idServicoTipo: ").append(idServicoTipo).append("\n");
    sb.append("  descricaoServicoTipo: ").append(descricaoServicoTipo).append("\n");
    sb.append("  comEntrada: ").append(comEntrada).append("\n");
    sb.append("  nomeCampanha: ").append(nomeCampanha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
