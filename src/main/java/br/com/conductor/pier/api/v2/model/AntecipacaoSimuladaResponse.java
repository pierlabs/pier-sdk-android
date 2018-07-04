package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaDetalhesResponse;
import java.math.BigDecimal;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{antecipacao_simulada_response_description}}}
 **/
@ApiModel(description = "{{{antecipacao_simulada_response_description}}}")
public class AntecipacaoSimuladaResponse  {
  
  @SerializedName("mcc")
  private Long mcc = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("idAntecipacaoSimulada")
  private Long idAntecipacaoSimulada = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idCompra")
  private Long idCompra = null;
  @SerializedName("idTipoTransacao")
  private Long idTipoTransacao = null;
  @SerializedName("quantidadeParcelasAntecipaveis")
  private Integer quantidadeParcelasAntecipaveis = null;
  @SerializedName("valorParcela")
  private BigDecimal valorParcela = null;
  @SerializedName("dataHoraSimulacao")
  private String dataHoraSimulacao = null;
  @SerializedName("taxaAntecipacaoAno")
  private BigDecimal taxaAntecipacaoAno = null;
  @SerializedName("nomeEstabelecimento")
  private String nomeEstabelecimento = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("dataCompra")
  private String dataCompra = null;
  @SerializedName("tipoOrigemTransacao")
  private String tipoOrigemTransacao = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("pais")
  private String pais = null;
  @SerializedName("latitude")
  private String latitude = null;
  @SerializedName("longitude")
  private String longitude = null;
  @SerializedName("idGrupoMCC")
  private Long idGrupoMCC = null;
  @SerializedName("descricaoGrupoMCC")
  private String descricaoGrupoMCC = null;
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("descricaoProduto")
  private String descricaoProduto = null;
  @SerializedName("descricaoEstabelecimento")
  private String descricaoEstabelecimento = null;
  @SerializedName("nomeFantasiaEstabelecimento")
  private String nomeFantasiaEstabelecimento = null;
  @SerializedName("detalhes")
  private List<AntecipacaoSimuladaDetalhesResponse> detalhes = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getMcc() {
    return mcc;
  }
  public void setMcc(Long mcc) {
    this.mcc = mcc;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{antecipacao_simulada_response_id_antecipacao_simulada_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_id_antecipacao_simulada_value}}}")
  public Long getIdAntecipacaoSimulada() {
    return idAntecipacaoSimulada;
  }
  public void setIdAntecipacaoSimulada(Long idAntecipacaoSimulada) {
    this.idAntecipacaoSimulada = idAntecipacaoSimulada;
  }

  
  /**
   * {{{antecipacao_simulada_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{antecipacao_simulada_response_id_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_id_compra_value}}}")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * {{{antecipacao_simulada_response_id_tipo_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_id_tipo_transacao_value}}}")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * {{{antecipacao_simulada_response_quantidade_parcelas_antecipaveis_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_quantidade_parcelas_antecipaveis_value}}}")
  public Integer getQuantidadeParcelasAntecipaveis() {
    return quantidadeParcelasAntecipaveis;
  }
  public void setQuantidadeParcelasAntecipaveis(Integer quantidadeParcelasAntecipaveis) {
    this.quantidadeParcelasAntecipaveis = quantidadeParcelasAntecipaveis;
  }

  
  /**
   * {{{antecipacao_simulada_response_valor_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_valor_parcela_value}}}")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * {{{antecipacao_simulada_response_data_hora_simulacao_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_data_hora_simulacao_value}}}")
  public String getDataHoraSimulacao() {
    return dataHoraSimulacao;
  }
  public void setDataHoraSimulacao(String dataHoraSimulacao) {
    this.dataHoraSimulacao = dataHoraSimulacao;
  }

  
  /**
   * {{{antecipacao_simulada_response_taxa_antecipacao_ano_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_taxa_antecipacao_ano_value}}}")
  public BigDecimal getTaxaAntecipacaoAno() {
    return taxaAntecipacaoAno;
  }
  public void setTaxaAntecipacaoAno(BigDecimal taxaAntecipacaoAno) {
    this.taxaAntecipacaoAno = taxaAntecipacaoAno;
  }

  
  /**
   * {{{antecipacao_simulada_response_nome_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_nome_estabelecimento_value}}}")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * {{{antecipacao_simulada_response_status_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_status_value}}}")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * {{{antecipacao_simulada_response_data_compra_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_data_compra_value}}}")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * {{{antecipacao_simulada_response_tipo_origem_transacao_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_tipo_origem_transacao_value}}}")
  public String getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * {{{antecipacao_simulada_response_cidade_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_cidade_value}}}")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{antecipacao_simulada_response_pais_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_pais_value}}}")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * {{{antecipacao_simulada_response_latitude_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_latitude_value}}}")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * {{{antecipacao_simulada_response_longitude_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_longitude_value}}}")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * {{{antecipacao_simulada_response_id_grupo_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_id_grupo_m_c_c_value}}}")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * {{{antecipacao_simulada_response_descricao_grupo_m_c_c_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_descricao_grupo_m_c_c_value}}}")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * {{{antecipacao_simulada_response_id_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_id_produto_value}}}")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * {{{antecipacao_simulada_response_descricao_produto_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_descricao_produto_value}}}")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * {{{antecipacao_simulada_response_descricao_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_descricao_estabelecimento_value}}}")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * {{{antecipacao_simulada_response_nome_fantasia_estabelecimento_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_nome_fantasia_estabelecimento_value}}}")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * {{{antecipacao_simulada_response_detalhes_value}}}
   **/
  @ApiModelProperty(value = "{{{antecipacao_simulada_response_detalhes_value}}}")
  public List<AntecipacaoSimuladaDetalhesResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<AntecipacaoSimuladaDetalhesResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaResponse {\n");
    
    sb.append("  mcc: ").append(mcc).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  idAntecipacaoSimulada: ").append(idAntecipacaoSimulada).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idCompra: ").append(idCompra).append("\n");
    sb.append("  idTipoTransacao: ").append(idTipoTransacao).append("\n");
    sb.append("  quantidadeParcelasAntecipaveis: ").append(quantidadeParcelasAntecipaveis).append("\n");
    sb.append("  valorParcela: ").append(valorParcela).append("\n");
    sb.append("  dataHoraSimulacao: ").append(dataHoraSimulacao).append("\n");
    sb.append("  taxaAntecipacaoAno: ").append(taxaAntecipacaoAno).append("\n");
    sb.append("  nomeEstabelecimento: ").append(nomeEstabelecimento).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataCompra: ").append(dataCompra).append("\n");
    sb.append("  tipoOrigemTransacao: ").append(tipoOrigemTransacao).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  pais: ").append(pais).append("\n");
    sb.append("  latitude: ").append(latitude).append("\n");
    sb.append("  longitude: ").append(longitude).append("\n");
    sb.append("  idGrupoMCC: ").append(idGrupoMCC).append("\n");
    sb.append("  descricaoGrupoMCC: ").append(descricaoGrupoMCC).append("\n");
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  descricaoProduto: ").append(descricaoProduto).append("\n");
    sb.append("  descricaoEstabelecimento: ").append(descricaoEstabelecimento).append("\n");
    sb.append("  nomeFantasiaEstabelecimento: ").append(nomeFantasiaEstabelecimento).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


