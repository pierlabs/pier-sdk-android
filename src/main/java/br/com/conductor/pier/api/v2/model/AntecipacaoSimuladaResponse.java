package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaDetalhesResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Response Representation of the Simulated Antecipation resource
 **/
@ApiModel(description = "Response Representation of the Simulated Antecipation resource")
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
   * Identifier Code of the simulation of antecipation
   **/
  @ApiModelProperty(value = "Identifier Code of the simulation of antecipation")
  public Long getIdAntecipacaoSimulada() {
    return idAntecipacaoSimulada;
  }
  public void setIdAntecipacaoSimulada(Long idAntecipacaoSimulada) {
    this.idAntecipacaoSimulada = idAntecipacaoSimulada;
  }

  
  /**
   * Identifier Code of the Account
   **/
  @ApiModelProperty(value = "Identifier Code of the Account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identifier Code of the shop event
   **/
  @ApiModelProperty(value = "Identifier Code of the shop event")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * Identifier Code of type of the shop event
   **/
  @ApiModelProperty(value = "Identifier Code of type of the shop event")
  public Long getIdTipoTransacao() {
    return idTipoTransacao;
  }
  public void setIdTipoTransacao(Long idTipoTransacao) {
    this.idTipoTransacao = idTipoTransacao;
  }

  
  /**
   * Quantity of the antecipated parcels
   **/
  @ApiModelProperty(value = "Quantity of the antecipated parcels")
  public Integer getQuantidadeParcelasAntecipaveis() {
    return quantidadeParcelasAntecipaveis;
  }
  public void setQuantidadeParcelasAntecipaveis(Integer quantidadeParcelasAntecipaveis) {
    this.quantidadeParcelasAntecipaveis = quantidadeParcelasAntecipaveis;
  }

  
  /**
   * Value of the parcel
   **/
  @ApiModelProperty(value = "Value of the parcel")
  public BigDecimal getValorParcela() {
    return valorParcela;
  }
  public void setValorParcela(BigDecimal valorParcela) {
    this.valorParcela = valorParcela;
  }

  
  /**
   * Date and time which the simulation was made
   **/
  @ApiModelProperty(value = "Date and time which the simulation was made")
  public String getDataHoraSimulacao() {
    return dataHoraSimulacao;
  }
  public void setDataHoraSimulacao(String dataHoraSimulacao) {
    this.dataHoraSimulacao = dataHoraSimulacao;
  }

  
  /**
   * Taxe of the antecipation applied (to the year)
   **/
  @ApiModelProperty(value = "Taxe of the antecipation applied (to the year)")
  public BigDecimal getTaxaAntecipacaoAno() {
    return taxaAntecipacaoAno;
  }
  public void setTaxaAntecipacaoAno(BigDecimal taxaAntecipacaoAno) {
    this.taxaAntecipacaoAno = taxaAntecipacaoAno;
  }

  
  /**
   * Establishment where the transaction was made
   **/
  @ApiModelProperty(value = "Establishment where the transaction was made")
  public String getNomeEstabelecimento() {
    return nomeEstabelecimento;
  }
  public void setNomeEstabelecimento(String nomeEstabelecimento) {
    this.nomeEstabelecimento = nomeEstabelecimento;
  }

  
  /**
   * Description of status of the shop authorization
   **/
  @ApiModelProperty(value = "Description of status of the shop authorization")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * Date of the shop
   **/
  @ApiModelProperty(value = "Date of the shop")
  public String getDataCompra() {
    return dataCompra;
  }
  public void setDataCompra(String dataCompra) {
    this.dataCompra = dataCompra;
  }

  
  /**
   * Transaction type of the shop
   **/
  @ApiModelProperty(value = "Transaction type of the shop")
  public String getTipoOrigemTransacao() {
    return tipoOrigemTransacao;
  }
  public void setTipoOrigemTransacao(String tipoOrigemTransacao) {
    this.tipoOrigemTransacao = tipoOrigemTransacao;
  }

  
  /**
   * City where the shop was made
   **/
  @ApiModelProperty(value = "City where the shop was made")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * Country where the shop was made
   **/
  @ApiModelProperty(value = "Country where the shop was made")
  public String getPais() {
    return pais;
  }
  public void setPais(String pais) {
    this.pais = pais;
  }

  
  /**
   * Latitudinal Coordinate of location of the shop
   **/
  @ApiModelProperty(value = "Latitudinal Coordinate of location of the shop")
  public String getLatitude() {
    return latitude;
  }
  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }

  
  /**
   * Longitudinal Coordinate of the shop location
   **/
  @ApiModelProperty(value = "Longitudinal Coordinate of the shop location")
  public String getLongitude() {
    return longitude;
  }
  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }

  
  /**
   * Identification Code of the MCC group of the shop
   **/
  @ApiModelProperty(value = "Identification Code of the MCC group of the shop")
  public Long getIdGrupoMCC() {
    return idGrupoMCC;
  }
  public void setIdGrupoMCC(Long idGrupoMCC) {
    this.idGrupoMCC = idGrupoMCC;
  }

  
  /**
   * Description of the Group MCC of the shop
   **/
  @ApiModelProperty(value = "Description of the Group MCC of the shop")
  public String getDescricaoGrupoMCC() {
    return descricaoGrupoMCC;
  }
  public void setDescricaoGrupoMCC(String descricaoGrupoMCC) {
    this.descricaoGrupoMCC = descricaoGrupoMCC;
  }

  
  /**
   * Identification Code of the shop product
   **/
  @ApiModelProperty(value = "Identification Code of the shop product")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * Description of the shop product
   **/
  @ApiModelProperty(value = "Description of the shop product")
  public String getDescricaoProduto() {
    return descricaoProduto;
  }
  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  
  /**
   * Description of the establishment of the shop
   **/
  @ApiModelProperty(value = "Description of the establishment of the shop")
  public String getDescricaoEstabelecimento() {
    return descricaoEstabelecimento;
  }
  public void setDescricaoEstabelecimento(String descricaoEstabelecimento) {
    this.descricaoEstabelecimento = descricaoEstabelecimento;
  }

  
  /**
   * Fantasy name of the Establishment
   **/
  @ApiModelProperty(value = "Fantasy name of the Establishment")
  public String getNomeFantasiaEstabelecimento() {
    return nomeFantasiaEstabelecimento;
  }
  public void setNomeFantasiaEstabelecimento(String nomeFantasiaEstabelecimento) {
    this.nomeFantasiaEstabelecimento = nomeFantasiaEstabelecimento;
  }

  
  /**
   * Details of the simulation
   **/
  @ApiModelProperty(value = "Details of the simulation")
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
