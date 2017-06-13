package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaDetalhesResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Antecipacao Simulada
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da resposta do recurso Antecipacao Simulada")
public class AntecipacaoSimuladaResponse  {
  
  @SerializedName("idSimulacao")
  private Long idSimulacao = null;
  @SerializedName("idCompra")
  private Long idCompra = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("dataHoraSimulacao")
  private String dataHoraSimulacao = null;
  @SerializedName("detalhes")
  private List<AntecipacaoSimuladaDetalhesResponse> detalhes = null;

  
  /**
   * C\u00C3\u00B3digo identificador da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da simula\u00C3\u00A7\u00C3\u00A3o de antecipa\u00C3\u00A7\u00C3\u00A3o.")
  public Long getIdSimulacao() {
    return idSimulacao;
  }
  public void setIdSimulacao(Long idSimulacao) {
    this.idSimulacao = idSimulacao;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da compra.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da compra.")
  public Long getIdCompra() {
    return idCompra;
  }
  public void setIdCompra(Long idCompra) {
    this.idCompra = idCompra;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da conta.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da conta.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Data e hora em que a simula\u00C3\u00A7\u00C3\u00A3o foi feita.
   **/
  @ApiModelProperty(value = "Data e hora em que a simula\u00C3\u00A7\u00C3\u00A3o foi feita.")
  public String getDataHoraSimulacao() {
    return dataHoraSimulacao;
  }
  public void setDataHoraSimulacao(String dataHoraSimulacao) {
    this.dataHoraSimulacao = dataHoraSimulacao;
  }

  
  /**
   * Detalhes da simula\u00C3\u00A7\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Detalhes da simula\u00C3\u00A7\u00C3\u00A3o.")
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
    
    sb.append("  idSimulacao: ").append(idSimulacao).append("\n");
    sb.append("  idCompra: ").append(idCompra).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  dataHoraSimulacao: ").append(dataHoraSimulacao).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


