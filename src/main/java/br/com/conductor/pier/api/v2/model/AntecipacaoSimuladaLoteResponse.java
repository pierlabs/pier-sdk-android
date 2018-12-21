package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaResponse;
import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa??o da resposta do recurso Antecipacao Simulada
 **/
@ApiModel(description = "Representa??o da resposta do recurso Antecipacao Simulada")
public class AntecipacaoSimuladaLoteResponse  {
  
  @SerializedName("valorTotalAntecipado")
  private BigDecimal valorTotalAntecipado = null;
  @SerializedName("valorTotalDesconto")
  private BigDecimal valorTotalDesconto = null;
  @SerializedName("valorTotalComDesconto")
  private BigDecimal valorTotalComDesconto = null;
  @SerializedName("antecipacoesSimuladas")
  private List<AntecipacaoSimuladaResponse> antecipacoesSimuladas = null;

  
  /**
   * Total value antecipated
   **/
  @ApiModelProperty(value = "Total value antecipated")
  public BigDecimal getValorTotalAntecipado() {
    return valorTotalAntecipado;
  }
  public void setValorTotalAntecipado(BigDecimal valorTotalAntecipado) {
    this.valorTotalAntecipado = valorTotalAntecipado;
  }

  
  /**
   * Total value of the discount
   **/
  @ApiModelProperty(value = "Total value of the discount")
  public BigDecimal getValorTotalDesconto() {
    return valorTotalDesconto;
  }
  public void setValorTotalDesconto(BigDecimal valorTotalDesconto) {
    this.valorTotalDesconto = valorTotalDesconto;
  }

  
  /**
   * Total value anticipated with the discount
   **/
  @ApiModelProperty(value = "Total value anticipated with the discount")
  public BigDecimal getValorTotalComDesconto() {
    return valorTotalComDesconto;
  }
  public void setValorTotalComDesconto(BigDecimal valorTotalComDesconto) {
    this.valorTotalComDesconto = valorTotalComDesconto;
  }

  
  /**
   * Antecipations Simulated
   **/
  @ApiModelProperty(value = "Antecipations Simulated")
  public List<AntecipacaoSimuladaResponse> getAntecipacoesSimuladas() {
    return antecipacoesSimuladas;
  }
  public void setAntecipacoesSimuladas(List<AntecipacaoSimuladaResponse> antecipacoesSimuladas) {
    this.antecipacoesSimuladas = antecipacoesSimuladas;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AntecipacaoSimuladaLoteResponse {\n");
    
    sb.append("  valorTotalAntecipado: ").append(valorTotalAntecipado).append("\n");
    sb.append("  valorTotalDesconto: ").append(valorTotalDesconto).append("\n");
    sb.append("  valorTotalComDesconto: ").append(valorTotalComDesconto).append("\n");
    sb.append("  antecipacoesSimuladas: ").append(antecipacoesSimuladas).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
